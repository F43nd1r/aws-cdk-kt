package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi
import software.amazon.awscdk.services.sam.CfnApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApi(id: String, props: CfnApiProps): CfnApi = CfnApi(this, id, props)

@Generated
public fun Construct.cfnApi(
  id: String,
  props: CfnApiProps,
  initializer: @AwsCdkDsl CfnApi.() -> Unit,
): CfnApi = CfnApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApi(id: String, initializer: @AwsCdkDsl CfnApi.Builder.() -> Unit):
    CfnApi = CfnApi.Builder.create(this, id).apply(initializer).build()
