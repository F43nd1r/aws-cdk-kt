@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
