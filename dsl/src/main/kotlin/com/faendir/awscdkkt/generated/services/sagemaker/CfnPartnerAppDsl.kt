package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPartnerApp
import software.amazon.awscdk.services.sagemaker.CfnPartnerAppProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPartnerApp(
  id: String,
  props: CfnPartnerAppProps,
  initializer: @AwsCdkDsl CfnPartnerApp.() -> Unit = {},
): CfnPartnerApp = CfnPartnerApp(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPartnerApp(id: String, initializer: @AwsCdkDsl CfnPartnerApp.Builder.() -> Unit = {}): CfnPartnerApp = CfnPartnerApp.Builder.create(this, id).apply(initializer).build()
