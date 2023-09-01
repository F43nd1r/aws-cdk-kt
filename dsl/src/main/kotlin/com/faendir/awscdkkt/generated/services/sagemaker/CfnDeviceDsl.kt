package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.amazon.awscdk.services.sagemaker.CfnDeviceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDevice(
  id: String,
  props: CfnDeviceProps,
  initializer: @AwsCdkDsl CfnDevice.() -> Unit = {},
): CfnDevice = CfnDevice(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDevice(id: String, initializer: @AwsCdkDsl CfnDevice.Builder.() -> Unit
    = {}): CfnDevice = CfnDevice.Builder.create(this, id).apply(initializer).build()
