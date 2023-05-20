@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
