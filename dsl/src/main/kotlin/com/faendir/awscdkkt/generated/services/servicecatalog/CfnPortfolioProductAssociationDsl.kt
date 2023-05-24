package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortfolioProductAssociation(id: String,
    props: CfnPortfolioProductAssociationProps): CfnPortfolioProductAssociation =
    CfnPortfolioProductAssociation(this, id, props)

@Generated
public fun Construct.cfnPortfolioProductAssociation(
  id: String,
  props: CfnPortfolioProductAssociationProps,
  initializer: @AwsCdkDsl CfnPortfolioProductAssociation.() -> Unit,
): CfnPortfolioProductAssociation = CfnPortfolioProductAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnPortfolioProductAssociation(id: String, initializer: @AwsCdkDsl
    CfnPortfolioProductAssociation.Builder.() -> Unit): CfnPortfolioProductAssociation =
    CfnPortfolioProductAssociation.Builder.create(this, id).apply(initializer).build()
