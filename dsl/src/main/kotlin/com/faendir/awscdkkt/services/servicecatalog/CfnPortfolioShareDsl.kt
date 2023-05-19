@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps
import software.constructs.Construct

public fun Construct.cfnPortfolioShare(
  id: String,
  props: CfnPortfolioShareProps,
  initializer: CfnPortfolioShare.() -> Unit = {},
): CfnPortfolioShare = CfnPortfolioShare(this, id, props).apply(initializer)
