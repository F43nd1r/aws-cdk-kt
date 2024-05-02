package com.faendir.awscdkkt.generated.services.qbusiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.qbusiness.CfnRetriever
import software.amazon.awscdk.services.qbusiness.CfnRetrieverProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRetriever(
  id: String,
  props: CfnRetrieverProps,
  initializer: @AwsCdkDsl CfnRetriever.() -> Unit = {},
): CfnRetriever = CfnRetriever(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRetriever(id: String, initializer: @AwsCdkDsl
    CfnRetriever.Builder.() -> Unit = {}): CfnRetriever = CfnRetriever.Builder.create(this,
    id).apply(initializer).build()
