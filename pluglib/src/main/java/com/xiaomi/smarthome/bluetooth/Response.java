package com.xiaomi.smarthome.bluetooth;

import android.os.Bundle;
/**
 * Created by liwentian on 2015/11/10.
 */
public class Response {

    /**
     * ApiLevel: 15
     */
    public interface BleResponse<T> {
        public void onResponse(int code, T data);
    }

    /**
     * ApiLevel: 15
     */
    public interface BleConnectResponse extends BleResponse<Bundle> {

    }

    /**
     * ApiLevel: 15
     */
    public interface BleReadResponse extends BleResponse<byte[]> {

    }

    /**
     * ApiLevel: 15
     */
    public interface BleWriteResponse extends BleResponse<Void> {

    }

    /**
     * ApiLevel: 15
     */
    public interface BleNotifyResponse extends BleResponse<Void> {

    }

    /**
     * ApiLevel: 15
     */
    public interface BleReadRssiResponse extends BleResponse<Integer> {

    }

    /**
     * ApiLevel: 19
     */
    public interface BleWriteResponse2 extends BleWriteResponse {

    }

    public interface BleUpgradeResponse extends BleResponse<String> {
        void onProgress(int progress);
    }

    public interface BleCallResponse extends BleResponse<Bundle> {

    }

    /**
     * ApiLevel: 25
     */
    public interface BleDeviceStatusResponse extends BleResponse<Integer> {

    }
}
