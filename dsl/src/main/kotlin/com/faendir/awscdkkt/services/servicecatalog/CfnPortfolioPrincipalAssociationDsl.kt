@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps
import software.constructs.Construct

public fun Construct.cfnPortfolioPrincipalAssociation(
  id: String,
  props: CfnPortfolioPrincipalAssociationProps,
  initializer: CfnPortfolioPrincipalAssociation.() -> Unit = {},
): CfnPortfolioPrincipalAssociation = CfnPortfolioPrincipalAssociation(this, id,
    props).apply(initializer)
