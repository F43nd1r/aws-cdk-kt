package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.servicecatalog.PortfolioProps
import software.constructs.Construct

@Generated
public fun Construct.portfolio(id: String, props: PortfolioProps): Portfolio = Portfolio(this, id,
    props)

@Generated
public fun Construct.portfolio(
  id: String,
  props: PortfolioProps,
  initializer: @AwsCdkDsl Portfolio.() -> Unit,
): Portfolio = Portfolio(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPortfolio(id: String, initializer: @AwsCdkDsl
    Portfolio.Builder.() -> Unit): Portfolio = Portfolio.Builder.create(this,
    id).apply(initializer).build()
