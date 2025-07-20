package com.faendir.awscdkkt.generated.services.identitystore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroup
import software.amazon.awscdk.services.identitystore.CfnGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroup(
  id: String,
  props: CfnGroupProps,
  initializer: @AwsCdkDsl CfnGroup.() -> Unit = {},
): CfnGroup = CfnGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroup(id: String, initializer: @AwsCdkDsl CfnGroup.Builder.() -> Unit = {}): CfnGroup = CfnGroup.Builder.create(this, id).apply(initializer).build()
