@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
import software.constructs.Construct

public fun Construct.cfnResolverQueryLoggingConfigAssociation(id: String,
    initializer: CfnResolverQueryLoggingConfigAssociation.() -> Unit = {}):
    CfnResolverQueryLoggingConfigAssociation = CfnResolverQueryLoggingConfigAssociation(this,
    id).apply(initializer)

public fun Construct.cfnResolverQueryLoggingConfigAssociation(
  id: String,
  props: CfnResolverQueryLoggingConfigAssociationProps,
  initializer: CfnResolverQueryLoggingConfigAssociation.() -> Unit = {},
): CfnResolverQueryLoggingConfigAssociation = CfnResolverQueryLoggingConfigAssociation(this, id,
    props).apply(initializer)
