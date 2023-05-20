@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import software.constructs.Construct

public fun Construct.cfnConfigurationAssociation(
  id: String,
  props: CfnConfigurationAssociationProps,
  initializer: CfnConfigurationAssociation.() -> Unit = {},
): CfnConfigurationAssociation = CfnConfigurationAssociation(this, id, props).apply(initializer)
