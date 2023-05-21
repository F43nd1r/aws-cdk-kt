package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationAssociation(
  id: String,
  props: CfnConfigurationAssociationProps,
  initializer: CfnConfigurationAssociation.() -> Unit = {},
): CfnConfigurationAssociation = CfnConfigurationAssociation(this, id, props).apply(initializer)
