package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.servicecatalog.PortfolioProps
import software.constructs.Construct

@Generated
public fun Construct.portfolio(
  id: String,
  props: PortfolioProps,
  initializer: Portfolio.() -> Unit = {},
): Portfolio = Portfolio(this, id, props).apply(initializer)
