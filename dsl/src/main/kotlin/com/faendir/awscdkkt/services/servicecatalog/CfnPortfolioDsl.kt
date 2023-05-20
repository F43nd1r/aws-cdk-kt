@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolio
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps
import software.constructs.Construct

public fun Construct.cfnPortfolio(
  id: String,
  props: CfnPortfolioProps,
  initializer: CfnPortfolio.() -> Unit = {},
): CfnPortfolio = CfnPortfolio(this, id, props).apply(initializer)
