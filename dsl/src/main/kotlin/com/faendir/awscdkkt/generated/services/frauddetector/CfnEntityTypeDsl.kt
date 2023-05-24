package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnEntityType
import software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEntityType(id: String, props: CfnEntityTypeProps): CfnEntityType =
    CfnEntityType(this, id, props)

@Generated
public fun Construct.cfnEntityType(
  id: String,
  props: CfnEntityTypeProps,
  initializer: @AwsCdkDsl CfnEntityType.() -> Unit,
): CfnEntityType = CfnEntityType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEntityType(id: String, initializer: @AwsCdkDsl
    CfnEntityType.Builder.() -> Unit): CfnEntityType = CfnEntityType.Builder.create(this,
    id).apply(initializer).build()
