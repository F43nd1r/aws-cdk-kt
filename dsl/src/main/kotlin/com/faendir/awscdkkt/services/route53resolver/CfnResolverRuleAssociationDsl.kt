@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps
import software.constructs.Construct

public fun Construct.cfnResolverRuleAssociation(
  id: String,
  props: CfnResolverRuleAssociationProps,
  initializer: CfnResolverRuleAssociation.() -> Unit = {},
): CfnResolverRuleAssociation = CfnResolverRuleAssociation(this, id, props).apply(initializer)
