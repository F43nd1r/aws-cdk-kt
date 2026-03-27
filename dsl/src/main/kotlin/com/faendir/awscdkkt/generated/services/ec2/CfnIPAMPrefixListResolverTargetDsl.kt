package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPrefixListResolverTarget
import software.amazon.awscdk.services.ec2.CfnIPAMPrefixListResolverTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMPrefixListResolverTarget(
  id: String,
  props: CfnIPAMPrefixListResolverTargetProps,
  initializer: @AwsCdkDsl CfnIPAMPrefixListResolverTarget.() -> Unit = {},
): CfnIPAMPrefixListResolverTarget = CfnIPAMPrefixListResolverTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMPrefixListResolverTarget(id: String, initializer: @AwsCdkDsl CfnIPAMPrefixListResolverTarget.Builder.() -> Unit = {}): CfnIPAMPrefixListResolverTarget = CfnIPAMPrefixListResolverTarget.Builder.create(this, id).apply(initializer).build()
