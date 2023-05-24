package com.faendir.awscdkkt.generated.services.synthetics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnGroup
import software.amazon.awscdk.services.synthetics.CfnGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroup(id: String, props: CfnGroupProps): CfnGroup = CfnGroup(this, id,
    props)

@Generated
public fun Construct.cfnGroup(
  id: String,
  props: CfnGroupProps,
  initializer: @AwsCdkDsl CfnGroup.() -> Unit,
): CfnGroup = CfnGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroup(id: String, initializer: @AwsCdkDsl CfnGroup.Builder.() -> Unit):
    CfnGroup = CfnGroup.Builder.create(this, id).apply(initializer).build()
