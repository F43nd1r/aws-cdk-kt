@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMScope
import software.amazon.awscdk.services.ec2.CfnIPAMScopeProps
import software.constructs.Construct

public fun Construct.cfnIPAMScope(
  id: String,
  props: CfnIPAMScopeProps,
  initializer: CfnIPAMScope.() -> Unit = {},
): CfnIPAMScope = CfnIPAMScope(this, id, props).apply(initializer)
