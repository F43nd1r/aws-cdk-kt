package com.faendir.awscdkkt.generated.services.kinesisanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationV2(id: String, props: CfnApplicationV2Props): CfnApplicationV2 =
    CfnApplicationV2(this, id, props)

@Generated
public fun Construct.cfnApplicationV2(
  id: String,
  props: CfnApplicationV2Props,
  initializer: @AwsCdkDsl CfnApplicationV2.() -> Unit,
): CfnApplicationV2 = CfnApplicationV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationV2(id: String, initializer: @AwsCdkDsl
    CfnApplicationV2.Builder.() -> Unit): CfnApplicationV2 = CfnApplicationV2.Builder.create(this,
    id).apply(initializer).build()
