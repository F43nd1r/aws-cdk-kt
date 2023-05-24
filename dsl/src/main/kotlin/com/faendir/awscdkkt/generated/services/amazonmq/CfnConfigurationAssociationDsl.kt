package com.faendir.awscdkkt.generated.services.amazonmq

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationAssociation(id: String,
    props: CfnConfigurationAssociationProps): CfnConfigurationAssociation =
    CfnConfigurationAssociation(this, id, props)

@Generated
public fun Construct.cfnConfigurationAssociation(
  id: String,
  props: CfnConfigurationAssociationProps,
  initializer: @AwsCdkDsl CfnConfigurationAssociation.() -> Unit,
): CfnConfigurationAssociation = CfnConfigurationAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationAssociation(id: String, initializer: @AwsCdkDsl
    CfnConfigurationAssociation.Builder.() -> Unit): CfnConfigurationAssociation =
    CfnConfigurationAssociation.Builder.create(this, id).apply(initializer).build()
