package com.faendir.awscdkkt.generated.services.greengrassv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnCoreDevice
import software.amazon.awscdk.services.greengrassv2.CfnCoreDeviceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCoreDevice(id: String, initializer: @AwsCdkDsl CfnCoreDevice.() -> Unit = {}): CfnCoreDevice = CfnCoreDevice(this, id).apply(initializer)

@Generated
public fun Construct.cfnCoreDevice(
  id: String,
  props: CfnCoreDeviceProps,
  initializer: @AwsCdkDsl CfnCoreDevice.() -> Unit = {},
): CfnCoreDevice = CfnCoreDevice(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCoreDevice(id: String, initializer: @AwsCdkDsl CfnCoreDevice.Builder.() -> Unit = {}): CfnCoreDevice = CfnCoreDevice.Builder.create(this, id).apply(initializer).build()
