@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
