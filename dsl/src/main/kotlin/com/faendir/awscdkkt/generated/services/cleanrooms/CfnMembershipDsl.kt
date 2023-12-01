package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnMembership
import software.amazon.awscdk.services.cleanrooms.CfnMembershipProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMembership(
  id: String,
  props: CfnMembershipProps,
  initializer: @AwsCdkDsl CfnMembership.() -> Unit = {},
): CfnMembership = CfnMembership(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMembership(id: String, initializer: @AwsCdkDsl
    CfnMembership.Builder.() -> Unit = {}): CfnMembership = CfnMembership.Builder.create(this,
    id).apply(initializer).build()
