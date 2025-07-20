package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMScope
import software.amazon.awscdk.services.ec2.CfnIPAMScopeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMScope(
  id: String,
  props: CfnIPAMScopeProps,
  initializer: @AwsCdkDsl CfnIPAMScope.() -> Unit = {},
): CfnIPAMScope = CfnIPAMScope(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMScope(id: String, initializer: @AwsCdkDsl CfnIPAMScope.Builder.() -> Unit = {}): CfnIPAMScope = CfnIPAMScope.Builder.create(this, id).apply(initializer).build()
