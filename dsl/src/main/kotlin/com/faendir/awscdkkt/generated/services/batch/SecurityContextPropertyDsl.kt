package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildSecurityContextProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.SecurityContextProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.SecurityContextProperty =
    CfnJobDefinition.SecurityContextProperty.Builder().apply(initializer).build()
