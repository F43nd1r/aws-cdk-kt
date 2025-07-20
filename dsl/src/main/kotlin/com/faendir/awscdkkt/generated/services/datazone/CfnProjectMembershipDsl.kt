package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnProjectMembership
import software.amazon.awscdk.services.datazone.CfnProjectMembershipProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProjectMembership(
  id: String,
  props: CfnProjectMembershipProps,
  initializer: @AwsCdkDsl CfnProjectMembership.() -> Unit = {},
): CfnProjectMembership = CfnProjectMembership(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProjectMembership(id: String, initializer: @AwsCdkDsl CfnProjectMembership.Builder.() -> Unit = {}): CfnProjectMembership = CfnProjectMembership.Builder.create(this, id).apply(initializer).build()
