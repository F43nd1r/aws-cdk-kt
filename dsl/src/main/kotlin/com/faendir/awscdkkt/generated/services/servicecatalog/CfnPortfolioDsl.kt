package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolio
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortfolio(
  id: String,
  props: CfnPortfolioProps,
  initializer: @AwsCdkDsl CfnPortfolio.() -> Unit = {},
): CfnPortfolio = CfnPortfolio(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPortfolio(id: String, initializer: @AwsCdkDsl
    CfnPortfolio.Builder.() -> Unit = {}): CfnPortfolio = CfnPortfolio.Builder.create(this,
    id).apply(initializer).build()
