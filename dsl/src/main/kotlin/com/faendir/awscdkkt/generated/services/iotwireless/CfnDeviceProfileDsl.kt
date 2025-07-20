package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceProfile(id: String, initializer: @AwsCdkDsl CfnDeviceProfile.() -> Unit = {}): CfnDeviceProfile = CfnDeviceProfile(this, id).apply(initializer)

@Generated
public fun Construct.cfnDeviceProfile(
  id: String,
  props: CfnDeviceProfileProps,
  initializer: @AwsCdkDsl CfnDeviceProfile.() -> Unit = {},
): CfnDeviceProfile = CfnDeviceProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeviceProfile(id: String, initializer: @AwsCdkDsl CfnDeviceProfile.Builder.() -> Unit = {}): CfnDeviceProfile = CfnDeviceProfile.Builder.create(this, id).apply(initializer).build()
