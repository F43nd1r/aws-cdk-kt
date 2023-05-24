package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Spacer
import software.amazon.awscdk.services.cloudwatch.SpacerProps

@Generated
public fun spacer(props: SpacerProps): Spacer = Spacer(props)

@Generated
public fun spacer(): Spacer = Spacer()

@Generated
public fun buildSpacer(initializer: @AwsCdkDsl Spacer.Builder.() -> Unit): Spacer =
    Spacer.Builder.create().apply(initializer).build()
