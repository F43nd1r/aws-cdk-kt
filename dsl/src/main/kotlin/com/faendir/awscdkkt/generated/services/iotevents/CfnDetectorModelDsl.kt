package com.faendir.awscdkkt.generated.services.iotevents

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDetectorModel(
  id: String,
  props: CfnDetectorModelProps,
  initializer: @AwsCdkDsl CfnDetectorModel.() -> Unit = {},
): CfnDetectorModel = CfnDetectorModel(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDetectorModel(id: String, initializer: @AwsCdkDsl
    CfnDetectorModel.Builder.() -> Unit = {}): CfnDetectorModel =
    CfnDetectorModel.Builder.create(this, id).apply(initializer).build()
