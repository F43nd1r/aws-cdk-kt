@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
import software.constructs.Construct

public fun Construct.cfnResolverQueryLoggingConfigAssociation(
  id: String,
  props: CfnResolverQueryLoggingConfigAssociationProps,
  initializer: CfnResolverQueryLoggingConfigAssociation.() -> Unit = {},
): CfnResolverQueryLoggingConfigAssociation = CfnResolverQueryLoggingConfigAssociation(this, id,
    props).apply(initializer)

public fun Construct.cfnResolverQueryLoggingConfigAssociation(id: String,
    initializer: CfnResolverQueryLoggingConfigAssociation.() -> Unit = {}):
    CfnResolverQueryLoggingConfigAssociation = CfnResolverQueryLoggingConfigAssociation(this,
    id).apply(initializer)
