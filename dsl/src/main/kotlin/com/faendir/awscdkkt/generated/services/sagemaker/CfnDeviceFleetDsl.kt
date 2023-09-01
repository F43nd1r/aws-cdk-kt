package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceFleet(
  id: String,
  props: CfnDeviceFleetProps,
  initializer: @AwsCdkDsl CfnDeviceFleet.() -> Unit = {},
): CfnDeviceFleet = CfnDeviceFleet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeviceFleet(id: String, initializer: @AwsCdkDsl
    CfnDeviceFleet.Builder.() -> Unit = {}): CfnDeviceFleet = CfnDeviceFleet.Builder.create(this,
    id).apply(initializer).build()
