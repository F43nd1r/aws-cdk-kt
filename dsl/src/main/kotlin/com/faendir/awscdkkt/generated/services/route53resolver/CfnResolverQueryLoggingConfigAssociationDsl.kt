package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociation
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverQueryLoggingConfigAssociation(id: String):
    CfnResolverQueryLoggingConfigAssociation = CfnResolverQueryLoggingConfigAssociation(this, id)

@Generated
public fun Construct.cfnResolverQueryLoggingConfigAssociation(id: String, initializer: @AwsCdkDsl
    CfnResolverQueryLoggingConfigAssociation.() -> Unit): CfnResolverQueryLoggingConfigAssociation =
    CfnResolverQueryLoggingConfigAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnResolverQueryLoggingConfigAssociation(id: String,
    props: CfnResolverQueryLoggingConfigAssociationProps): CfnResolverQueryLoggingConfigAssociation
    = CfnResolverQueryLoggingConfigAssociation(this, id, props)

@Generated
public fun Construct.cfnResolverQueryLoggingConfigAssociation(
  id: String,
  props: CfnResolverQueryLoggingConfigAssociationProps,
  initializer: @AwsCdkDsl CfnResolverQueryLoggingConfigAssociation.() -> Unit,
): CfnResolverQueryLoggingConfigAssociation = CfnResolverQueryLoggingConfigAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnResolverQueryLoggingConfigAssociation(id: String,
    initializer: @AwsCdkDsl CfnResolverQueryLoggingConfigAssociation.Builder.() -> Unit):
    CfnResolverQueryLoggingConfigAssociation =
    CfnResolverQueryLoggingConfigAssociation.Builder.create(this, id).apply(initializer).build()
