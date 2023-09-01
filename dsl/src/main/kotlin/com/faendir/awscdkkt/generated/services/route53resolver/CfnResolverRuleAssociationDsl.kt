package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverRuleAssociation(
  id: String,
  props: CfnResolverRuleAssociationProps,
  initializer: @AwsCdkDsl CfnResolverRuleAssociation.() -> Unit = {},
): CfnResolverRuleAssociation = CfnResolverRuleAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResolverRuleAssociation(id: String, initializer: @AwsCdkDsl
    CfnResolverRuleAssociation.Builder.() -> Unit = {}): CfnResolverRuleAssociation =
    CfnResolverRuleAssociation.Builder.create(this, id).apply(initializer).build()
