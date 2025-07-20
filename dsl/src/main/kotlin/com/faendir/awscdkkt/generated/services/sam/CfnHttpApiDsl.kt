package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi
import software.amazon.awscdk.services.sam.CfnHttpApiProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHttpApi(id: String, initializer: @AwsCdkDsl CfnHttpApi.() -> Unit = {}): CfnHttpApi = CfnHttpApi(this, id).apply(initializer)

@Generated
public fun Construct.cfnHttpApi(
  id: String,
  props: CfnHttpApiProps,
  initializer: @AwsCdkDsl CfnHttpApi.() -> Unit = {},
): CfnHttpApi = CfnHttpApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHttpApi(id: String, initializer: @AwsCdkDsl CfnHttpApi.Builder.() -> Unit = {}): CfnHttpApi = CfnHttpApi.Builder.create(this, id).apply(initializer).build()
