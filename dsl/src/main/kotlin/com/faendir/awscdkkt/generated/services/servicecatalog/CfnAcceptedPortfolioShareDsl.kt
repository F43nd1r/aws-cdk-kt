package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAcceptedPortfolioShare(
  id: String,
  props: CfnAcceptedPortfolioShareProps,
  initializer: @AwsCdkDsl CfnAcceptedPortfolioShare.() -> Unit = {},
): CfnAcceptedPortfolioShare = CfnAcceptedPortfolioShare(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAcceptedPortfolioShare(id: String, initializer: @AwsCdkDsl CfnAcceptedPortfolioShare.Builder.() -> Unit = {}): CfnAcceptedPortfolioShare = CfnAcceptedPortfolioShare.Builder.create(this, id).apply(initializer).build()
