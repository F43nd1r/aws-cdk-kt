@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps
import software.constructs.Construct

public fun Construct.cfnPortfolioProductAssociation(
  id: String,
  props: CfnPortfolioProductAssociationProps,
  initializer: CfnPortfolioProductAssociation.() -> Unit = {},
): CfnPortfolioProductAssociation = CfnPortfolioProductAssociation(this, id,
    props).apply(initializer)
