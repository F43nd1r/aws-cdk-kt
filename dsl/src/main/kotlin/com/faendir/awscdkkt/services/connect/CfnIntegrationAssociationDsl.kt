@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnIntegrationAssociation
import software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps
import software.constructs.Construct

public fun Construct.cfnIntegrationAssociation(
  id: String,
  props: CfnIntegrationAssociationProps,
  initializer: CfnIntegrationAssociation.() -> Unit = {},
): CfnIntegrationAssociation = CfnIntegrationAssociation(this, id, props).apply(initializer)
