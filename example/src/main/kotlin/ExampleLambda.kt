
import com.faendir.awscdkkt.generated.app
import com.faendir.awscdkkt.generated.services.lambda.buildFunction
import com.faendir.awscdkkt.generated.stack
import software.amazon.awscdk.services.lambda.Code
import software.amazon.awscdk.services.lambda.Runtime

fun main() {
    app {
        stack("LambdaStack") {
            buildFunction("HelloHandler") {
                code(Code.fromInline("function handler() { console.log('Hello, CDK'); }"))
                handler("index.handler")
                runtime(Runtime.NODEJS_16_X)
            }
        }
    }.synth()
}