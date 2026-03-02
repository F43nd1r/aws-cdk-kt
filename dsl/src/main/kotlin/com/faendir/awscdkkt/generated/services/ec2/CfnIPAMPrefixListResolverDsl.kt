package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPrefixListResolver
import software.amazon.awscdk.services.ec2.CfnIPAMPrefixListResolverProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMPrefixListResolver(
  id: String,
  props: CfnIPAMPrefixListResolverProps,
  initializer: @AwsCdkDsl CfnIPAMPrefixListResolver.() -> Unit = {},
): CfnIPAMPrefixListResolver = CfnIPAMPrefixListResolver(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMPrefixListResolver(id: String, initializer: @AwsCdkDsl CfnIPAMPrefixListResolver.Builder.() -> Unit = {}): CfnIPAMPrefixListResolver = CfnIPAMPrefixListResolver.Builder.create(this, id).apply(initializer).build()
