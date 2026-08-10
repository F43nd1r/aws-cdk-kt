package com.faendir.awscdkkt.generated.services.identitystore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnAllGroupMemberships
import software.amazon.awscdk.services.identitystore.CfnAllGroupMembershipsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAllGroupMemberships(id: String, initializer: @AwsCdkDsl CfnAllGroupMemberships.() -> Unit = {}): CfnAllGroupMemberships = CfnAllGroupMemberships(this, id).apply(initializer)

@Generated
public fun Construct.cfnAllGroupMemberships(
  id: String,
  props: CfnAllGroupMembershipsProps,
  initializer: @AwsCdkDsl CfnAllGroupMemberships.() -> Unit = {},
): CfnAllGroupMemberships = CfnAllGroupMemberships(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAllGroupMemberships(id: String, initializer: @AwsCdkDsl CfnAllGroupMemberships.Builder.() -> Unit = {}): CfnAllGroupMemberships = CfnAllGroupMemberships.Builder.create(this, id).apply(initializer).build()
