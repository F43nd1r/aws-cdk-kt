package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortfolioShare(id: String, props: CfnPortfolioShareProps): CfnPortfolioShare
    = CfnPortfolioShare(this, id, props)

@Generated
public fun Construct.cfnPortfolioShare(
  id: String,
  props: CfnPortfolioShareProps,
  initializer: @AwsCdkDsl CfnPortfolioShare.() -> Unit,
): CfnPortfolioShare = CfnPortfolioShare(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPortfolioShare(id: String, initializer: @AwsCdkDsl
    CfnPortfolioShare.Builder.() -> Unit): CfnPortfolioShare =
    CfnPortfolioShare.Builder.create(this, id).apply(initializer).build()
