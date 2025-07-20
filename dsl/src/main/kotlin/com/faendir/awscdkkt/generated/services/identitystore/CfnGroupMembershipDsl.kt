package com.faendir.awscdkkt.generated.services.identitystore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroupMembership(
  id: String,
  props: CfnGroupMembershipProps,
  initializer: @AwsCdkDsl CfnGroupMembership.() -> Unit = {},
): CfnGroupMembership = CfnGroupMembership(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGroupMembership(id: String, initializer: @AwsCdkDsl CfnGroupMembership.Builder.() -> Unit = {}): CfnGroupMembership = CfnGroupMembership.Builder.create(this, id).apply(initializer).build()
