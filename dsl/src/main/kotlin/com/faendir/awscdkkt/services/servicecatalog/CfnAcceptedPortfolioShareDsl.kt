@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps
import software.constructs.Construct

public fun Construct.cfnAcceptedPortfolioShare(
  id: String,
  props: CfnAcceptedPortfolioShareProps,
  initializer: CfnAcceptedPortfolioShare.() -> Unit = {},
): CfnAcceptedPortfolioShare = CfnAcceptedPortfolioShare(this, id, props).apply(initializer)
