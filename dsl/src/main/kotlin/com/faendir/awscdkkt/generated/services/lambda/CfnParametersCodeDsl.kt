package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnParametersCode
import software.amazon.awscdk.services.lambda.CfnParametersCodeProps

@Generated
public fun cfnParametersCode(props: CfnParametersCodeProps): CfnParametersCode =
    CfnParametersCode(props)

@Generated
public fun cfnParametersCode(): CfnParametersCode = CfnParametersCode()

@Generated
public fun buildCfnParametersCode(initializer: @AwsCdkDsl CfnParametersCode.Builder.() -> Unit):
    CfnParametersCode = CfnParametersCode.Builder.create().apply(initializer).build()
