package com.faendir.awscdkkt.generated.services.iot1click

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnDevice
import software.amazon.awscdk.services.iot1click.CfnDeviceProps
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
