package com.ruoyi.netmanager.service;

import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.fluent.SnmpBuilder;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author old.lazy.sexy
 * @description
 * @date 2023-10-07
 */
public class TestService {
    private static final OID SYS_NAME_OID = new OID("1.3.6.1.2.1.1.5.0");

    public static void main(String[] args) {
        try {
            TransportMapping<? extends Address> transport = new DefaultUdpTransportMapping();
            Snmp snmp = new Snmp(transport);
            // 定义SNMP参数
            CommunityTarget target = new CommunityTarget();
            target.setCommunity(new OctetString("public"));
            target.setAddress(GenericAddress.parse("udp:192.168.1.112/161"));
            target.setVersion(SnmpConstants.version2c);
            target.setTimeout(3000);
            target.setRetries(2);
            // 发送SNMP GET请求获取设备信息
            PDU pdu = new PDU();
            pdu.add(new VariableBinding(SYS_NAME_OID));
            pdu.setType(PDU.GET);
            ResponseEvent response = snmp.send(pdu, target);
            // 解析设备信息响应
            if (response.getResponse() != null) {
                String sysName = response.getResponse().get(0).getVariable().toString();
                System.out.println("Device name: " + sysName);
            }
            // 自动发现设备
//            List<String> ipRange = getIPRange("192.168.0.1", "192.168.0.3");
//            for (String ip : ipRange) {
//                Address address = GenericAddress.parse("udp:" + ip + "/161");
//                target.setAddress(address);
//                response = snmp.send(pdu, target);
//                if (response.getResponse() != null) {
//                    String sysName = response.getResponse().get(0).getVariable().toString();
//                    System.out.println("Device found: " + sysName + ", IP: " + ip);
//                }
//            }
            // 关闭SNMP管理器
            snmp.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> getIPRange(String startIP, String endIP) {
        List<String> ipList = new ArrayList<>();
        String[] startIPParts = startIP.split("\\.");
        String[] endIPParts = endIP.split("\\.");
        int[] startIPInts = new int[4];
        int[] endIPInts = new int[4];
        for (int i = 0; i < 4; i++) {
            startIPInts[i] = Integer.parseInt(startIPParts[i]);
            endIPInts[i] = Integer.parseInt(endIPParts[i]);
        }
        while (!equalsIP(startIPInts, endIPInts)) {
            ipList.add(formatIP(startIPInts));
            startIPInts[3]++;
            if (startIPInts[3] == 256) {
                startIPInts[3] = 0;
                startIPInts[2]++;
                if (startIPInts[2] == 256) {
                    startIPInts[2] = 0;
                    startIPInts[1]++;
                    if (startIPInts[1] == 256) {
                        startIPInts[1] = 0;
                        startIPInts[0]++;
                    }
                }
            }
        }
        ipList.add(formatIP(startIPInts));
        return ipList;
    }

    // 判断两个IP地址是否相等
    private static boolean equalsIP(int[] ip1, int[] ip2) {
        for (int i = 0; i < 4; i++) {
            if (ip1[i] != ip2[i]) {
                return false;
            }
        }
        return true;
    }

    // 将IP地址格式化为字符串
    private static String formatIP(int[] ip) {
        return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
    }
}
