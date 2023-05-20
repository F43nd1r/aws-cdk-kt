@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps
import software.constructs.Construct

public fun Construct.cfnServiceActionAssociation(
  id: String,
  props: CfnServiceActionAssociationProps,
  initializer: CfnServiceActionAssociation.() -> Unit = {},
): CfnServiceActionAssociation = CfnServiceActionAssociation(this, id, props).apply(initializer)
