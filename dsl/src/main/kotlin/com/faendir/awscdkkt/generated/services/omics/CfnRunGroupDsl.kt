package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.amazon.awscdk.services.omics.CfnRunGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRunGroup(id: String, props: CfnRunGroupProps): CfnRunGroup =
    CfnRunGroup(this, id, props)

@Generated
public fun Construct.cfnRunGroup(
  id: String,
  props: CfnRunGroupProps,
  initializer: @AwsCdkDsl CfnRunGroup.() -> Unit,
): CfnRunGroup = CfnRunGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnRunGroup(id: String): CfnRunGroup = CfnRunGroup(this, id)

@Generated
public fun Construct.cfnRunGroup(id: String, initializer: @AwsCdkDsl CfnRunGroup.() -> Unit):
    CfnRunGroup = CfnRunGroup(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnRunGroup(id: String, initializer: @AwsCdkDsl
    CfnRunGroup.Builder.() -> Unit): CfnRunGroup = CfnRunGroup.Builder.create(this,
    id).apply(initializer).build()
