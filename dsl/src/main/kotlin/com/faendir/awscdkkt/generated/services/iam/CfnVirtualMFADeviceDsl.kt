package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualMFADevice(
  id: String,
  props: CfnVirtualMFADeviceProps,
  initializer: @AwsCdkDsl CfnVirtualMFADevice.() -> Unit = {},
): CfnVirtualMFADevice = CfnVirtualMFADevice(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVirtualMFADevice(id: String, initializer: @AwsCdkDsl
    CfnVirtualMFADevice.Builder.() -> Unit = {}): CfnVirtualMFADevice =
    CfnVirtualMFADevice.Builder.create(this, id).apply(initializer).build()
