package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnRecommender
import software.amazon.awscdk.services.customerprofiles.CfnRecommenderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecommender(
  id: String,
  props: CfnRecommenderProps,
  initializer: @AwsCdkDsl CfnRecommender.() -> Unit = {},
): CfnRecommender = CfnRecommender(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecommender(id: String, initializer: @AwsCdkDsl CfnRecommender.Builder.() -> Unit = {}): CfnRecommender = CfnRecommender.Builder.create(this, id).apply(initializer).build()
